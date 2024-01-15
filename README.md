Responsive Compose

This is a responsive compose library for android developers if you're using jetpack compose for your projects , you use sp for font size and sd for dimensions. for example

![carbon](https://github.com/majid2851/ResponsiveJetpackCompose/assets/46685643/1c43b31a-f411-4d1f-a8e5-4f651b923cec)



but there is a problem , your compose is not responsive . for having a responsive UI using jetpack compose , you can easily use this library.

here is an responsive UI example

![carbon](https://github.com/majid2851/ResponsiveJetpackCompose/assets/46685643/48e58eda-0cb0-47dd-912a-edc26fc4a837)



very simple just use sdp and ssp instead of sd and sp

-------------------------------------------------------------------------


----Gradle------

	dependencyResolutionManagement{

		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
 
	}
 
----Dependency-------

	dependencies
	{

  		implementation 'com.github.majid2851:ResponsiveJetpackCompose:Tag'
  
	}

--------------------------------------------------------------------------------


