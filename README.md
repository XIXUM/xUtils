# xUtils
General Utilities for other Projects

most prominent is the class XList and XPath

## XList:
is an class extension of a classic list with the addition that you can navigate through the elements from the perspective of a list elementby
- `element.getprecessor()` get preceeding neighbor element
- `element.getsuccessor()` get following neigbor element

#XPath:
extends path by defining a Path more semantically.
it is defined as

`Root` / `container node` (Directory) ... `container node` (Directory) / `leaf node` (File)
it uses XList to store the path enabling to navigate through the path with
- `getPrecessor()`
- `getSuccessor()`


more info coming soon
