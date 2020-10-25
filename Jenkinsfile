node{
	stage("Git clone"){
		git credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/surjeetkm26/microservices.git'
	}
	stage("Maven clean build artifact"){
		def mavenHome= tool name: "Maven", type: "maven"
		def command= "${mavenHome}/bin/mvn"
		bat "${command} clean package"
	}
	stage("Build docker image"){
		app=docker.build("surjeetproject/test-app")
	}
	stage("Push Docker image to Container Registry"){
			docker.withRegistry('https://eu.gcr.io', 'gcr:myregistry') {
 	 		app.push("${env.BUILD_NUMBER}")
 	 		app.push("latest")
		}
	}
	
}
