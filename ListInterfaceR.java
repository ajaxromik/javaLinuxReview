// ********************************************************
// Interface ListInterface for the ADT list.
// *********************************************************
public interface ListInterfaceR
{
  boolean isEmpty();
  int size();
  void add(int index, Object item) throws ListIndexOutOfBoundsException;
  Object get(int index) throws ListIndexOutOfBoundsException;
  Object remove(int index) throws ListIndexOutOfBoundsException;
  void removeAll();
  String toString();
  String toStringR();
}  // end ListInterfaceR