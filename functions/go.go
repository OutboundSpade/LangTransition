package main

func main() {
	name := "John"
	println(greet(name))
}

func greet(name string) string {
	return "Hello " + name
}
