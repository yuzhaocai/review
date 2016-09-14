package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;

public class Demo {
	
	public static void main(String[] args) {
		//FileChannel 
//		try {
//			RandomAccessFile randomAccessFile = new RandomAccessFile("E:/study/nio-data.txt","rw");
//			FileChannel fileChannel = randomAccessFile.getChannel();
//			ByteBuffer buf = ByteBuffer.allocate(48);
//			int bytesRead = fileChannel.read(buf);
//			
//			while(bytesRead != -1){
//				System.out.println("read:" + bytesRead);
//				buf.flip();
//				while(buf.hasRemaining()){
//					System.out.println((char) buf.get());
//				}
//				buf.clear();
//				bytesRead = fileChannel.read(buf);
//			}
//			randomAccessFile.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		//IntBuffer
//		IntBuffer intBuffer = IntBuffer.allocate(8);
//		intBuffer.put(new int[]{1,2,3,4,5,6,7,8});
//		intBuffer.flip();
//		while (intBuffer.hasRemaining()) {
//			System.out.print(intBuffer.get());
//		}
		
		//FileChannel transferFrom
//		try {
//			RandomAccessFile fromFile = new RandomAccessFile("E:/study/nio-from-data.txt","r");
//			FileChannel fromChannel = fromFile.getChannel();
//			
//			RandomAccessFile toFile = new RandomAccessFile("E:/study/nio-to-data.txt","rw");
//			FileChannel toChannel = toFile.getChannel();
//			
//			long position = 0;
//			long count = fromChannel.size();
//			
//			toChannel.transferFrom(fromChannel, position, count);
//			
//			fromFile.close();
//			toFile.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//Selector
		//使用一个线程处理多个Channel通道
		//Selector和Channel配合使用时，Channel必须处于非阻塞模式下
		//	*FileChannel：FileChannel不能与Selector一起使用，因为FileChannel不能切换到非阻塞模式下
		//	*ScoketChannel：ScoketChannel能和Selector配合使用
		try {
			Selector selector = Selector.open();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
