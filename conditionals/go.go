package main

func main() {
	if (true && !false) || false {
		println("This is true")
	} else if true {
		println("This is also true")
	} else {
		println("This prints otherwise")
	}

}
