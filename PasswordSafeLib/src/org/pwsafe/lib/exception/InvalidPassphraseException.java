/*
 * $Id$
 * 
 * Copyright (c) 2008 David Muller <roxon@users.sourceforge.net>.
 * All rights reserved. Use of the code is allowed under the
 * Artistic License 2.0 terms, as specified in the LICENSE file
 * distributed with this code, or available from
 * http://www.opensource.org/licenses/artistic-license-2.0.php
 */
package org.pwsafe.lib.exception;

/**
 * An exception to indicate that the passphrase given for a file is incorrect.
 * 
 * @author Kevin Preece
 */
public class InvalidPassphraseException extends Exception
{
	/**
	 * 
	 */
	public InvalidPassphraseException()
	{
		super();
	}

	/**
	 * @param message
	 */
	public InvalidPassphraseException(String message)
	{
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidPassphraseException(String message, Throwable cause)
	{
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public InvalidPassphraseException(Throwable cause)
	{
		super(cause);
	}
}
