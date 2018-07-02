package com.lcc.proxy.spring;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author: lcc
 * @Date: 2018-07-02
 **/
public class jdkTest {
	public static void main(String[] args) throws Exception{
		String src = "package com.lcc.proxy.spring;\n" +
				"\n" +
				"public class TankLogProxy implements Moveable {\n" +
				"\tprivate Tank tank;\n" +
				"\n" +
				"\tpublic TankLogProxy() {\n" +
				"\t\t\n" +
				"\t}\n" +
				"\n" +
				"\tpublic TankLogProxy(Tank tank) {\n" +
				"\t\tthis.tank = tank;\n" +
				"\t}\n" +
				"\n" +
				"\t@Override\n" +
				"\tpublic void move() {\n" +
				"\t\tSystem.out.println(\"开始执行\");\n" +
				"\t\ttank.move();\n" +
				"\t\tSystem.out.println(\"结束执行\");\n" +
				"\t}\n" +
				"}";

		String fileName = System.getProperty("user.dir") + "\\src\\main\\java\\com\\lcc\\proxy\\spring\\TankLogProxy.java";
		System.out.println(fileName);
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		//拿到默认编译器 编译
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileManager.getJavaFileObjects(fileName);
		JavaCompiler.CompilationTask t = compiler.getTask(null, fileManager, null, null, null, units);
		t.call();
		fileManager.close();
		//加载如内存 生成新对象
		URL[] urls= new URL[]{new URL("file:/" +System.getProperty("user.dir")+"/src")};
		URLClassLoader urlClassLoader =new URLClassLoader(urls);
		Class c =urlClassLoader.loadClass("com.lcc.proxy.spring.TankLogProxy");
		System.out.println(c);
		//c.newInstance();
		Constructor ctr = c.getConstructor(Tank.class);
		Moveable m = (Moveable) ctr.newInstance(new Tank());
		m.move();
	}
}
