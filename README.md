# LogLocal

在日常开发过程中，一些后台服务，比如IM，后台定时任务，都需要一套本地日志系统来监控程序是否正常，Android本身提供的日志系统只能在终端显示，为了模拟一套和android Log系统相同的环境，我自己写了一套本地日志系统来解决以上问题。

为了能让不同等级的日志以不同的颜色显示，我用html的方式来实现，这样我们通过浏览器打开就可以了。演示效果如下：
![htmldemoimg](https://github.com/lorcanluo/myHugoProject/blob/master/myImage/loghtml/htmldemo.png?raw=true)

github地址: <https://github.com/lorcanluo/LogHtml>

##使用方法

在你的Application或则主Activity调用：

```
LogLocal.init(this.getPackageName());
```

方法来初始化，传入参数为你需要存放文件的目录。

目前支持三种级别的日志：

### 普通消息 
在文件中以黑色字体显示

调用方法：

```
   /**
     * info log
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void i(String tag, String msg) {

    }
``` 
### 调试信息 
在文件中以绿色字体显示

调用方式:

```
/**
     * debug log
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void d(String tag, String msg) {
     
    }
```
### 错误信息  
在文件中以红色字体显示

调用方法：

```
    /**
     * error log
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void e(String tag, String msg) {

    }

```

### 关闭日志

如果你不想在正式环境输出日志，可以调用以下方法来屏蔽日志输出：

```
/**
 * open or close the function
 *
 * @param isDebuggable if set to false, not print the message.
 */
 public static void setIsDebuggable(boolean isDebuggable)()
```


##问题
有什么问题，可以直接提交issus
或则联系我 email <763736665@qq.com>



