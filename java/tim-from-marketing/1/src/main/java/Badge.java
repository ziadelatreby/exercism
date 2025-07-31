import java.util.StringJoiner;

class Badge {
    private static final String SEPARATOR = " - ";
    private static final String DEFAULT_DEPARTMENT = "OWNER";

    public String print(Integer id, String name, String department) {
        StringJoiner joiner = new StringJoiner(SEPARATOR);
        
        if (id != null) {
            joiner.add("[" + id + "]");
        }
        
        joiner.add(name);
        joiner.add(department != null ? department.toUpperCase() : DEFAULT_DEPARTMENT);
        
        return joiner.toString();
   }
}
