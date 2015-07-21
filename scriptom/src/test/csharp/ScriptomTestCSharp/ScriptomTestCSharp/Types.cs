using System;
using System.Runtime.InteropServices;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace ScriptomTestCSharp
{
    /// <summary>
    /// Methods for simple type-conversion verification in Scriptom.
    /// </summary>
    [Guid("f987c995-218a-49d9-9593-d5632f962485")]
    interface ISimpleTypes
    {
        byte MirrorByte(byte value);
        sbyte MirrorSByte(sbyte value);
        int MirrorInt(int value);
        uint MirrorUInt(uint value);
        long MirrorLong(long value);
        ulong MirrorULong(ulong value);
        String MirrorString(String value);
        DateTime MirrorDate(DateTime value);
        float MirrorFloat(float value);
        double MirrorDouble(double value);
    }

    [ComVisible(true)]
    [ClassInterface(ClassInterfaceType.None)]
    [Guid("8a923e65-ffc9-4908-918e-ee0d767b3ae3")]
    [ProgId("ScriptomTestCSharp.SimpleTypes")]
    public class SimpleTypes : ISimpleTypes
    {
        public SimpleTypes()
        {
        }

        /// <summary>
        /// Mirrors the byte input to the return value.
        /// </summary>
        /// <param name="value">A byte.</param>
        /// <returns>The byte passed in.</returns>
        public byte MirrorByte(byte value)
        {
            return value;
        }

        /// <summary>
        /// Mirrors the sbyte input to the return value.
        /// </summary>
        /// <param name="value">A sbyte.</param>
        /// <returns>The sbyte passed in.</returns>
        public sbyte MirrorSByte(sbyte value)
        {
            return value;
        }

        /// <summary>
        /// Mirrors the integer input to the return value.
        /// </summary>
        /// <param name="value">An integer.</param>
        /// <returns>The integer passed in.</returns>
        public int MirrorInt(int value)
        {
            return value;
        }

        /// <summary>
        /// Mirrors the unsigned-integer input to the return value.
        /// </summary>
        /// <param name="value">An unsigned-integer.</param>
        /// <returns>The unsigned-integer passed in.</returns>
        public uint MirrorUInt(uint value)
        {
            return value;
        }

        /// <summary>
        /// Mirrors the long input to the return value.
        /// </summary>
        /// <param name="value">A long.</param>
        /// <returns>The long passed in.</returns>
        public long MirrorLong(long value)
        {
            return value;
        }

        /// <summary>
        /// Mirrors the unsigned-long input to the return value.
        /// </summary>
        /// <param name="value">An unsigned-long.</param>
        /// <returns>The unsigned-long passed in.</returns>
        public ulong MirrorULong(ulong value)
        {
            return value;
        }

        /// <summary>
        /// Mirrors the input to the output.
        /// </summary>
        /// <param name="value">The value.</param>
        /// <returns>The value.</returns>
        public float MirrorFloat(float value)
        {
            return value;
        }

        /// <summary>
        /// Mirrors the input to the output.
        /// </summary>
        /// <param name="value">The value.</param>
        /// <returns>The value.</returns>
        public double MirrorDouble(double value)
        {
            return value;
        }

        /// <summary>
        /// Mirrors the string input to the return value.
        /// </summary>
        /// <param name="value">A string.</param>
        /// <returns>The string that was passed in.</returns>
        public String MirrorString(String value)
        {
            return value;
        }

        /// <summary>
        /// Mirrors the date input to the return value.
        /// </summary>
        /// <param name="value">A date.</param>
        /// <returns>The date that was passed in.</returns>
        public DateTime MirrorDate(DateTime value)
        {
            return value;
        }
    }

    /// <summary>
    /// This enumeration will be passed to the type library.  It can be turned into
    /// a Java class using the ExtractTlbInfo.groovy script.  This doesn't really do
    /// anything, I just thought it was a good example.
    /// </summary>
    [ComVisible(true)]
    [Guid("9a923e65-ffc9-4908-918e-ee0d767b3ae3")]
    public enum ScriptomTestConstants : int
    {
        A = 1, B, C   
    }
}
