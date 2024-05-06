public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		Person rio= new Person();
		rio.name="小笠原理央";
		rio.age=25;
		System.out.println(rio.name);
		System.out.println(rio.age);

		taro.talk();
		taro.walk();
		taro.run();

		Robot aibo = new Robot();
		aibo.name="アイボ";

		Robot asimo = new Robot();
		asimo.name="アシモ";

		Robot pepper = new Robot();
		pepper.name="ペッパー";

		aibo.talk();
		aibo.walk();
		aibo.run();
		asimo.walk();
		asimo.walk();
		asimo.run();
		pepper.run();
		pepper.walk();
		pepper.run();

	}
}