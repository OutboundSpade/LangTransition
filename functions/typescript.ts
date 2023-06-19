let name = "John";
console.log(greet(name));

function greet(name: string): string {
	return "Hello " + name;
}

export { }; // to avoid "cannot redeclare block-scoped variable" error