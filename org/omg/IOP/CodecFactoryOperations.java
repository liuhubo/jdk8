package org.omg.IOP;


/**
* org/omg/IOP/CodecFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /tmp/workspace/8-2-build-solaris-amd64/jdk8u5/2488/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, March 18, 2014 7:27:02 AM UTC
*/


/**
   * <code>Codecs</code> are obtained from the <code>CodecFactory</code>. 
   * The <code>CodecFactory</code> is obtained through a call to 
   * <code>ORB.resolve_initial_references( "CodecFactory" )</code>.
   */
public interface CodecFactoryOperations 
{

  /**
       * Create a <code>Codec</code> of the given encoding.
       * <p>
       * @param enc The encoding for which to create a <code>Codec</code>.
       * @return A <code>Codec</code> obtained with the given encoding.
       * @exception UnknownEncoding thrown if this factory cannot create a 
       *     <code>Codec</code> of the given encoding.
       */
  org.omg.IOP.Codec create_codec (org.omg.IOP.Encoding enc) throws org.omg.IOP.CodecFactoryPackage.UnknownEncoding;
} // interface CodecFactoryOperations
