**注意事项：**
<li><font>使用feign时，如果需要传值对象，则使用post方法进行传输。否则，即便是采用get，依然会转换为POST方法</font>
<li>使用feign，传输简单参数(java基本类和数组)时，需要加注解@RequestParam，如果不指定请求类别，则默认为get
<li>使用feign,传输参数是复杂参数，即自定义对象，则需要在参数前加注解@RequsetBody，传参
需要放到body中，同时，如果不指明请求类别，默认为POST，指明为GET，依然以POST为请求方式

