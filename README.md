# RetrofitUtils
retrofit的封装。
step1 在工程的gradle添加引用
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 step2 添加依赖
 dependencies {
	        implementation 'com.github.gyadministrator:RetrofitUtils:v1.0.0'
	}
  
  step3 在activity中使用
  在onCreate()中添加init()方法
  LoadingUtils.init(this);
  //显示加载框
  LoadingUtils.show("加载中...");
  //隐藏加载框
  LoadingUtils.dissmiss();
