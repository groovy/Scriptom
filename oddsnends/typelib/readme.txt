This folder contains a Groovy script that will generate Java libraries of constants based on Windows Type Libraries (constants, IID, etc.).  These libraries are not required for using Scriptom, but they can be helpful. The constant names match Microsoft's documentation, and the interface IDs (used in event handling) are otherwise pretty hard to discover. 

To use this script, you must first register the included DLL. It's in the ZIP file. Instructions are included in the ZIP. 

Note that you can create a TLB for a .NET Framework DLL using TLBEXP.EXE.  This TLB can be used to generate wrapper classes, just as with any other TLB. 