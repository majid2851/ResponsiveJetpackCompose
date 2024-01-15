Responsive Compose

This is a responsive compose library for android developers if you're using jetpack compose for your projects , you use sp for font size and sd for dimensions. for example

Box( modifier=Modifier.width(100.dp))
{
  Text( text = "Sample Text", fontSize = 15.sp )
}

but there is a problem , your compose is not responsive . for having a responsive UI using jetpack compose , you can easily use this library.

here is an responsive UI example

Box( modifier=Modifier.width(100.sdp))
{
 Text( text = "Sample Text", fontSize = 15.ssp ) 
}

very simple just use sdp and ssp instead of sp and sd

-------------------------------------------------------------------------




dependencyResolutionManagement
 {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		mavenCentral()
		maven { url 'https://jitpack.io' }
	}
}

dependencies
{
	 implementation 'com.github.majid2851:ResponsiveJetpackCompose:Tag'
}

--------------------------------------------------------------------------------


