package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerAlreadyUninstalled.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /tmp/workspace/8-2-build-solaris-amd64/jdk8u5/2488/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, March 18, 2014 7:27:02 AM UTC
*/

public final class ServerAlreadyUninstalled extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerAlreadyUninstalled ()
  {
    super(ServerAlreadyUninstalledHelper.id());
  } // ctor

  public ServerAlreadyUninstalled (int _serverId)
  {
    super(ServerAlreadyUninstalledHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyUninstalled (String $reason, int _serverId)
  {
    super(ServerAlreadyUninstalledHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyUninstalled
