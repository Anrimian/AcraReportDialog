# AcraReportDialog
Android Acra report dialog. Shows stacktrace on screen when app crashes. Can be useful for developing.

## Usage
```
public class YourApp extends Application {  
  
     @Override  
     public void onCreate() {  
         super.onCreate();  
         //...  
         if (BuildConfig.DEBUG) {  
             AcraReportDialog.setupCrashDialog(this);  
         }  
    }  
    
}
```

## Repository
Make sure you have jitpack repository in your root build.gradle

```
allprojects {
    repositories {
        ...
	maven { url 'https://jitpack.io' }
    }
}
```
Add dependecy

```
dependencies {
    implementation 'com.github.Anrimian:AcraReportDialog:0.0.5'
}
```
Latest version: [![](https://jitpack.io/v/Anrimian/AcraReportDialog.svg)](https://jitpack.io/#Anrimian/AcraReportDialog)


