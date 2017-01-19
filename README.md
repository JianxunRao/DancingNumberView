# DancingNumberView

[![](https://jitpack.io/v/JianxunRao/DancingNumberView.svg)](https://jitpack.io/#JianxunRao/DancingNumberView)


DancingNumberView是一个用于跳动显示文本中数字的控件,继承自TextView.这种控件一般用于显示金额等对用户较为敏感的数字,让UI交互更加生动.
它具有以下几点特性:
- 自动获取文本中的所有数字,并同时开始跳动,免去多个TextView拼接的麻烦
- 支持数字按照自定义的格式显示,例如限定只显示小数点后两位

## Preview
![screenshot](https://github.com/JianxunRao/DancingNumberView/blob/master/app/screenshot/device-2017-01-19-175313.gif)

## Import
### Gradle

Step 1. Add the JitPack repository to your project build file

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}

Step 2. Add the dependency in your app build file

	dependencies {
	       compile 'com.github.JianxunRao:DancingNumberView:V1.0.0'
	}

## Usage
### .xml

    <me.trojx.dancingnumber.DancingNumberView
            android:id="@+id/dnv"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:dnv_duration="6000"
            app:dnv_format="%.2f"/>
### .java

    DancingNumberView dnv = (DancingNumberView) findViewById(R.id.dnv);
    dnv.setText(text);
    dnv.setDuration(duration);//设置完成跳动的持续时长(单位ms)
    dnv.setFormat(format);//设置数组的显示格式
    dnv.dance();

## Method

- `duration` defines the duration(ms) of the number in the text will dance.
- `format` defines the format of the number in the text. [see String.format()](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#format(java.util.Locale,%20java.lang.String,%20java.lang.Object...))

## License
GPL 2.0