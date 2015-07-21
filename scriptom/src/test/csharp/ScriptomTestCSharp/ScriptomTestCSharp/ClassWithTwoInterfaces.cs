using System;
using System.Runtime.InteropServices;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace ScriptomTestCSharp
{
    [ComVisible(true)]
    [Guid("5a57439d-0147-43da-b817-7acc3e8be5c5")]
    public interface IInterfaceOne
    {
        int IAmNumberOne(); 
    }

    [ComVisible(true)]
    [Guid("3e8aa2b0-a2aa-4512-848b-f72f51a4dc25")]
    public interface IInterfaceTwo
    {
        int IAmNumberTwo();
    }

    /// <summary>
    /// Very simple setup of a class with two COM interfaces.
    /// The Groovy side can see only one interface at a time, and actually
    /// has to cast to one or the other using .toInterface().
    /// </summary>
    [ComDefaultInterface(typeof(IInterfaceOne))]
    [ComVisible(true)]
    [ClassInterface(ClassInterfaceType.None)]
    [Guid("90799802-2975-4582-bb49-37383b7e4eef")]
    [ProgId("ScriptomTestCSharp.ClassWithTwoInterfaces")]
    public class ClassWithTwoInterfaces : IInterfaceOne, IInterfaceTwo
    {
        public int IAmNumberOne()
        {
            return 1;
        }

        public int IAmNumberTwo()
        {
            return 2;
        }
    }

    [ComVisible(true)]
    [Guid("041bd380-4368-43bf-9c9e-5ef9bd2bdddf")]
    public interface IClassConsumer
    {
        IInterfaceOne mirrorOne(IInterfaceOne value);
        IInterfaceTwo mirrorTwo(IInterfaceTwo value);
    }

    /// <summary>
    /// Class with a couple of methods to cast between interfaces. 
    /// The client can pass a ClassWithTwoInterfaces, and it becomes
    /// whatever type the method defines.  The client is then obligated
    /// to use that interface only.
    /// </summary>
    [ComVisible(true)]
    [ClassInterface(ClassInterfaceType.None)]
    [Guid("c7bf86a2-c6f2-431f-9245-0c87622704ae")]
    [ProgId("ScriptomTestCSharp.ClassConsumer")]
    public class ClassConsumer : IClassConsumer
    {
        public IInterfaceOne mirrorOne(IInterfaceOne value)
        {
            return value;
        }

        public IInterfaceTwo mirrorTwo(IInterfaceTwo value)
        {
            return value;
        }
    }
}
