# LogHtml
为了解决一些后台任务的监控，为了解决一些后台任务的监控，输出日志以html文本的方式到本地文件（该方式可以在文件中显示不同颜色的字体），可以通过浏览器打开该文件。
比如常用的IM后台服务和定时后台任务都应该用日志来监控程序是否正常，因为不同手机杀进程的方式是不一样的，所以通过日志，我们可以分析我们程序是否健壮。

## 使用方法

在你的Application或则主Activity调用：

```
LogHtml.init(this.getPackageName());
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


