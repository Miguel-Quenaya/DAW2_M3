class Box {
	public double width;
	public double height;
	public double length;
	//private double side;/no es necesaria...

	Box (double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	Box (double side) {
		this.width = side;
		this.height = side;
		this.length = side;
	}
	
	public double volume() {
		double volume = length * width * height;
		return volume;
	}
	
	public double area() {
		double area = length * width + 2 * width * height + 2 * length * height;
		return area;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getLength() {
		return length;
	}
}
