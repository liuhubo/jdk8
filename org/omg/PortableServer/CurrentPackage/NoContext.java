package org.omg.PortableServer.CurrentPackage;


/**
* org/omg/PortableServer/CurrentPackage/NoContext.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /tmp/workspace/8-2-build-solaris-amd64/jdk8u5/2488/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, March 18, 2014 7:27:02 AM UTC
*/

public final class NoContext extends org.omg.CORBA.UserException
{

  public NoContext ()
  {
    super(NoContextHelper.id());
  } // ctor


  public NoContext (String $reason)
  {
    super(NoContextHelper.id() + "  " + $reason);
  } // ctor

} // class NoContext
