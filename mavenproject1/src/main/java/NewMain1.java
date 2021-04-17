Template inclusion failed (for parameter value "/Templates/Licenses/license-default.txt"):
Cannot find 'jar:file:/C:/netbeans/ide/modules/org-netbeans-modules-projectui.jar!/org/netbeans/modules/project/ui/resources/license-default.txt'

----
FTL stack trace ("~" means nesting-related):
	- Failed at: #include "${project.licensePath}"  [in template "Templates/Classes/Main.java" at line 4, column 

1]
----
/**
 *
 * @author Stallion
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
