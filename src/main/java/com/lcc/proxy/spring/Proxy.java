package com.lcc.proxy.spring;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * 代理类
 *
 * @author: lcc
 * @Date: 2018-07-02
 **/
public class Proxy {
	//用来产生新的代理类
	public static Object newProxyInstance(Class jiekou,InvocationHandler handler) throws Exception {
		// jdk complier api   CGLib直接生成二进制
		String methodStr = "";
		Method[] methods = jiekou.getMethods();
		for (Method method : methods) {
			methodStr = methodStr +
					"\t@Override\n" +

					"\tpublic void " + method.getName() + "() {\n" +
					"\t\tjava.lang.reflect.Method md = null;\n" +
					"\t\ttry {\n" +
					"\t\t md = "+jiekou.getName()+".class.getMethod(\""+ method.getName()+"\");\n"+
					"\t\t} catch (NoSuchMethodException e) {\n" +
					"\t\t\te.printStackTrace();\n" +
					"\t\t}\n"+

					"\t\thandler.invoke(this,md);\n" +
					"\t}\n";
		}
		String src = "package com.lcc.proxy.spring;\n" +
				"\n" +
				"public class TankLogProxy implements " + jiekou.getName() + " {\n" +

				"\tcom.lcc.proxy.spring.InvocationHandler handler;\n"+
				"\n" +
				"\tpublic TankLogProxy() {\n" +
				"\t\t\n" +
				"\t}\n" +
				"\n" +
				"\tpublic TankLogProxy(InvocationHandler handler) {\n" +
				"\t\tthis.handler = handler;\n" +
				"\t}\n" +
				"\n" +
				methodStr +
				"}";

		String fileName = System.getProperty("user.dir") + "\\src\\main\\java\\com\\lcc\\proxy\\spring\\TankLogProxy.java";
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
		//c.newInstance();
		Constructor ctr = c.getConstructor(InvocationHandler.class);
		Object o = ctr.newInstance(handler);
		return o;

	}
}
