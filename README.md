# LoadingDialog
LoadingDialog

经常需要使用到加载的弹出框，由于需求要使用模态窗口，在加载时阻止用户的其他操作行为。

需求很简单，但反而是没有找到可直接使用的基础组件，因此基于materialdialog件进行了简单的封装。


一
APP文件下引用


compile 'com.github.ywcai:LoadingDialog:1.0.0'


工程文件下引用



    repositories {
    
        jcenter()
        
        maven { url 'https://jitpack.io' }//增加该配置
        
    }
    
    
二、

然后直接在acitivy文件中实例化即可时候。

LoadingDialog loadingDialog=new LoadingDialog(this);

loadingDialog.setLoadingText("test");//可不设置，默认显示"laoding..."字样

loadingDialog.show();



三、

LoadingDialog是直接继承的materialdialog，显示和关闭方式和materialdialog调用方式相同。

如果需要设置背景的颜色，则需要使用materialdialog的方法来重新绘制。


