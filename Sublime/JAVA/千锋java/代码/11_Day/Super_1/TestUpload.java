public class TestUpload{
	public static void main(String[] args){
		
		//UploadUtil uu = new UploadUtil();
		
		//uu.upload();
		
		MyUploadUtil muu = new MyUploadUtil();
		
		muu.upload();
		
		
		super.upload();
	}
}

//上传工具
class UploadUtil{
	public void upload(){
		//100多行功能代码
		System.out.println("一百行代码");
	}
}

//我的上传工具
class MyUploadUtil extends UploadUtil{
	
	public void upload2(){
		//复用父类的upload方法
		super.upload();//调用父类的方法
		//追加一行修改名称的代码
		System.out.println("xxxxx");
	}
	
}