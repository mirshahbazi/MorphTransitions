# MorphTransitions

Morph transitions from FAB to dialog, and Button to dialog

[![](https://jitpack.io/v/mirshahbazi/MorphTransitions.svg)](https://jitpack.io/#mirshahbazi/MorphTransitions)


![Hero Image](https://github.com/mirshahbazi/MorphTransitions/blob/master/demo/demo.mp4)

# Usage
See the sample app. Typical usage:
```java
MorphTransform.addExtras(intent, color, dialogCornerRadius);
ActivityOptions options =
        ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, button,
                getString(R.string.morph_transition));
startActivity(intent, options.toBundle());
```
in the first activity, then:
```java
MorphTransform.setup(this, container, color, dialogCornerRadius));
```
in the next activity. Be sure that you override `onBackPressed()` and call `ActivityCompat.finishAfterTransition(DialogActivity.this);`

In addition, be sure that your activities themes have the attribute:
```xml
<item name="android:windowContentTransitions">true</item>
```
## Using with gradle
- Add the JitPack repository to your root build.gradle:
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```

- Add the dependency to your sub build.gradle:
```gradle
		dependencies {
	     implementation 'com.github.mirshahbazi:MorphTransitions:8222df52e5'
	}


```


License
--------

    Copyright MAM
