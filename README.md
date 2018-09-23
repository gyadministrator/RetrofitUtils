# RetrofitUtils
#retrofit的封装。
<br>step1 在工程的gradle添加引用<br>
allprojects {<br>
    <br>repositories {<br>
        <br>google()<br>
        <br>jcenter()<br>
        <br>maven { url 'https://jitpack.io' }<br>
    <br>}<br>
}
 <br>step2 添加依赖<br>
 dependencies {<br>
    <br>implementation 'com.github.gyadministrator:RetrofitUtils:v1.0.0'<br>
}
  <br>step3 在activity中使用<br>
  在onCreate()中添加init()方法<br>
  LoadingUtils.init(this);<br>
  //显示加载框<br>
  LoadingUtils.show("加载中...");<br>
  //隐藏加载框<br>
  LoadingUtils.dissmiss();
