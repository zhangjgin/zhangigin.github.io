public class TestUpload{
	public static void main(String[] args){
		
		//UploadUtil uu = new UploadUtil();
		
		//uu.upload();
		
		MyUploadUtil muu = new MyUploadUtil();
		
		muu.upload();
		
		
		super.upload();
	}
}

//�ϴ�����
class UploadUtil{
	public void upload(){
		//100���й��ܴ���
		System.out.println("һ���д���");
	}
}

//�ҵ��ϴ�����
class MyUploadUtil extends UploadUtil{
	
	public void upload2(){
		//���ø����upload����
		super.upload();//���ø���ķ���
		//׷��һ���޸����ƵĴ���
		System.out.println("xxxxx");
	}
	
}