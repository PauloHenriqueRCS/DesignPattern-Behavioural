package FileS;

import java.util.*;

public interface Sorter {
	<T extends Comparable <? super T>> List<T> sort(List<T> list);
}
