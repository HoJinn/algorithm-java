package studyJava14.Network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerEx_01 {

	/* 
	 * UDP소켓 프로그래밍 
	 * UDP는 데이터를 전송할 때에 데이터가 잘 도착했는지 알아낼 방법이 없으며, 데이터를 보낸 순서대로 
	 * 도착한다는 보장도 할 수 없다. 그러나 UDP 는 TCP에 비해 훨씬 빠르게 전달 된다는 장점이 있다.  
	 * 
	 * TCP방식은 Socket 객체를 이용하여 통신을 하고 UDP방식은 DatagramPacket 객체를 이용하여 통신을 한다. 
	 */
	public static void main(String[] args) {
		
		try {
			// DatagramSocket 객체 생성 
			DatagramSocket socket = new DatagramSocket(9500);
			DatagramPacket inPacket;
			byte[] inMsg = null;
			
			while (true) { 
				// 데이터를 받기위한 바이트배열 생성 
				inMsg = new byte[1024];
				// DatagramPacket 객체 생성 
				inPacket = new DatagramPacket(inMsg,inMsg.length); 
				// 패킷데이터 수신 
				socket.receive(inPacket);
				// 문자열로 저장 
				String msg = new String (inMsg, 0, inPacket.getLength());
				System.out.println("클라이언트 메시지 : "+msg);
				
				// 클라이언트 아이피 
//				IntAddress address = inPacket.getAddress(); 
				// 클라이언트 포트 
//				int port = inPacket.getAddress();
//				System.out.println("클라이언트 주소 : " + address);
//				System.out.println("클라이언트포트번호 : " + port);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
