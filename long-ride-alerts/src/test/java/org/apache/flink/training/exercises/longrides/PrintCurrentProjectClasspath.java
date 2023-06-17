package org.apache.flink.training.exercises.longrides;

import java.io.File;
import org.junit.Test;

public class PrintCurrentProjectClasspath {
    @Test
    public void main() {
        String classpathStr = System.getProperty("java.class.path");
        String[] classpathEntries = classpathStr.split(File.pathSeparator);
        for (String classpathEntry : classpathEntries){
            System.out.println(classpathEntry);
        }
    }
}
