interface One { 
	void methodOne(); 
} 

class Two { 
	public void methodTwo() { 
	} 
} 

class Three extends Two implements One { 

	public void methodOne() 
	{ 
        System.out.println("Class Three");
    } 
} 
class Four {
    public static void main(String[] args) {
        Three three = new Three();
        three.methodOne();
    }
}

