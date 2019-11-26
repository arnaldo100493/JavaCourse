package reflection;

import java.lang.reflect.Method;

public class Reflection {

    @SuppressWarnings({"unchecked", "rawtypes"})
    Method findInheritedMethod(Class classType, String theMethodName, Class[] methodParamTypes) {
        Method inheritedMethod = null;
        while (classType != null) {
            try {
                inheritedMethod = classType.getDeclaredMethod(theMethodName, methodParamTypes);
                break;
            } catch (NoSuchMethodException ex) {
                classType = classType.getSuperclass();
            }
            return inheritedMethod;
        }
        return inheritedMethod;
    }

}
