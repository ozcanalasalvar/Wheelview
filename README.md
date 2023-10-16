# Wheelview
Wheelview is the picker library developed on top of Jetpack Compose.
<br>
<br>
<p align="center">
<img src="https://github.com/ozcanalasalvar/Wheelview/blob/main/art/textpicker.gif" width="350">
<img src="https://github.com/ozcanalasalvar/Wheelview/blob/main/art/imagepicker.gif" width="350">
</p>


# Usage

<br>

```java
WheelView(
  modifier = Modifier,
  itemSize = DpSize(/*width*/, /*height*/),
  selection = /*selection*/,
  itemCount = /*itemCount*/,
  selectorOption = SelectorOptions(),
  rowOffset = /*offset*/,
  onFocusItem = { index ->

  },
  content = {
    //Your composable (Height must not bigger than itemSize!!!)
  })
```

#### Parameters
Parameter | Type | Description
------ | ----- | --
itemSize | DpSize | Size of each composable that we set to content
selection | Int | Default selected item of wheel 
itemCount | Int | Size of elements we set to wheelview
rowOffset | Int | Count of items to be shown
isEndless | Boolean | Uses to enable or disable infinite scroll
userScrollEnabled | Boolean | ses to enable or disable user scroll 
selectorOption | SelectorOptions | whether the scrolling via the user gestures or accessibility actions is allowed. You can still scroll programmatically using the state even when it is disabled
onFocusItem |  | Called when the values in the wheelview are updated
content |  | composable of item


<br>
<br>
<br>

## Implementation Gradle

###### Add it in your root build.gradle at the end of repositories:

```groovy
dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		mavenCentral()
		maven { url 'https://jitpack.io' }
	}
}
```

###### Add the dependency

```groovy
dependencies {
  implementation 'com.github.ozcanalasalvar.picker:wheelview:2.0.4'
}
```
