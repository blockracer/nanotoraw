package nanoraw;

import static spark.Spark.*;


public class Main {

	public static void main(String[] args) {

		port(1337);

		staticFiles.externalLocation("/home/tux/javaProjects/rawPages");

		// Ensure the server is fully initialized before moving on

        	System.out.println("Server started on port 1337.");
		get("/hello", (request, response) -> "Hello, World!");
	}

}
