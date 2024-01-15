Responsive Compose

This is a responsive compose library for android developers if you're using jetpack compose for your projects , you use sp for font size and sd for dimensions. for example

![carbon](https://github.com/majid2851/ResponsiveJetpackCompose/assets/46685643/512894d0-8f35-41f2-986e-60245e94209d)

but there is a problem , your compose is not responsive . for having a responsive UI using jetpack compose , you can easily use this library.

here is an responsive UI example

![Uploading carbon (1).png…]()


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


