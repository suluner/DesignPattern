package department;

import employee.FulltimeEmployee;
import employee.ParttimeEmployee;

public abstract class Department {
    public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}
