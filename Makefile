daemonSample.class : daemonSample/daemonSample.java
	javac -cp ./commons-daemon-1.0.15.jar:. daemonSample/daemonSample.java
	jar -cvf daemonSample.jar daemonSample
