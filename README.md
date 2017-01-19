# DancingNumberView

[![](https://jitpack.io/v/JianxunRao/DancingNumberView.svg)](https://jitpack.io/#JianxunRao/DancingNumberView)

DancingNumberView是一个用于跳动显示文本中数字的控件,继承自TextView.
## Preview

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
	        compile 'com.github.Hitomis:CircleMenu:v1.0.2'
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

    DancingNumberView dancingNumberView = (DancingNumberView) findViewById(R.id.dnv);
    dancingNumberView.setText(text);
    dancingNumberView.setDuration(duration);
    dancingNumberView.setFormat(format);
    dancingNumberView.dance();

## Method

- `duration` defines the duration of the number in the text will dance.
- `format` defines the format of the number in the text. [see String.format()](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#format(java.util.Locale,%20java.lang.String,%20java.lang.Object...))