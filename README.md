# xUtils
General Utilities for other Projects

most prominent is the class XList and XPath

## XList:
is an class extension of a classic list with the addition that you can navigate through the elements from the perspective of a list element by
- `element.getprecessor()` get preceeding neighbor element
- `element.getsuccessor()` get following neigbor element

This is good if you operate within classes that are part of the list. Further this adds some semantic capability so you can navigate through a list by just providing the element.

## XPath:
extends path by defining a Path more semantically.
it is defined as

`Root` / `container node` (Directory) / ... / `container node` (Directory) / `leaf node` (File)
it uses XList to store the path enabling to navigate through the path with
- `getPrecessor()`
- `getSuccessor()`


more info coming soon
