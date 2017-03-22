public class Circle
	extends GeometricObject{
		private double radius;

		public Circle(){
		}
		public Circle(double radius){
			this.radius = radius;
		}
		public Circle(double radius, String color, boolean filled){
			super(color, filled);
			this.radius = radius;
		}

		public double getRadius(){
			return radius;
		}
		public void setRadius(){
			this.radius = radius;
		}
		public double getArea(){
			return radius * radius * Math.PI;
		}
		public String toString(){
			return super.toString() + "radius is" + radius;
		}

	}