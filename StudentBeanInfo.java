import java.beans.*;

public class StudentBeanInfo extends SimpleBeanInfo {
public PropertyDescriptor[] getPropertyDescriptors() {
try {
PropertyDescriptor name = new PropertyDescriptor("name", studentBean.class);
name.setShortDescription("Name of the student");
PropertyDescriptor age = new PropertyDescriptor("age", studentBean.class);
age.setShortDescription("Age of the student");
return new PropertyDescriptor[] { name, age };
} catch (Exception e) {
return null;
}
}
}
