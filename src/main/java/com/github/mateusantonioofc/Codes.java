package com.github.mateusantonioofc;

public class Codes {
    
	// Visit: https://www.iana.org/assignments/http-status-codes/http-status-codes.xhtml
    public static final int StatusContinue           			= 100;
	public static final int StatusSwitchingProtocols 			= 101;
	public static final int StatusProcessing         			= 102;
	public static final int StatusEarlyHints         			= 103;

    public static final int StatusOK                   			= 200;
	public static final int StatusCreated              			= 201;
	public static final int StatusAccepted             			= 202;
	public static final int StatusNonAuthoritativeInfo 			= 203;
	public static final int StatusNoContent            			= 204;
	public static final int StatusResetContent         			= 205;
	public static final int StatusPartialContent       			= 206;
	public static final int StatusMultiStatus          			= 207;
	public static final int StatusAlreadyReported      			= 208;
	public static final int StatusIMUsed               			= 226;

	public static final int StatusMultipleChoices   			= 300;
	public static final int StatusMovedPermanently  			= 301;
	public static final int StatusFound             			= 302;
	public static final int StatusSeeOther          			= 303;
	public static final int StatusNotModified       			= 304;
	public static final int StatusUseProxy          			= 305;
	// 306 (Unused)	
	public static final int StatusTemporaryRedirect 			= 307;
	public static final int StatusPermanentRedirect 			= 308;

	// Status of client
	
	public static final int StatusBadRequest                   	= 400;
	public static final int StatusUnauthorized                 	= 401;
	public static final int StatusPaymentRequired              	= 402;
	public static final int StatusForbidden                    	= 403;
	public static final int StatusNotFound                     	= 404;
	public static final int StatusMethodNotAllowed             	= 405;
	public static final int StatusNotAcceptable                	= 406;
	public static final int StatusProxyAuthRequired            	= 407;
	public static final int StatusRequestTimeout               	= 408;
	public static final int StatusConflict                     	= 409;
	public static final int StatusGone                         	= 410;
	public static final int StatusLengthRequired               	= 411;
	public static final int StatusPreconditionFailed           	= 412;
	public static final int StatusRequestEntityTooLarge        	= 413;
	public static final int StatusRequestURITooLong            	= 414;
	public static final int StatusUnsupportedMediaType         	= 415;
	public static final int StatusRequestedRangeNotSatisfiable 	= 416;
	public static final int StatusExpectationFailed            	= 417;
	public static final int StatusTeapot                       	= 418;
	public static final int StatusMisdirectedRequest           	= 421;
	public static final int StatusUnprocessableEntity          	= 422;
	public static final int StatusLocked                       	= 423;
	public static final int StatusFailedDependency             	= 424;
	public static final int StatusTooEarly                     	= 425;
	public static final int StatusUpgradeRequired              	= 426;
	public static final int StatusPreconditionRequired         	= 428;
	public static final int StatusTooManyRequests              	= 429;
	public static final int StatusRequestHeaderFieldsTooLarge  	= 431;
	public static final int StatusUnavailableForLegalReasons   	= 451;

	// Status of server;
	public static final int StatusInternalServerError           = 500;
	public static final int StatusNotImplemented                = 501;
	public static final int StatusBadGateway                    = 502;
	public static final int StatusServiceUnavailable            = 503;
	public static final int StatusGatewayTimeout                = 504;
	public static final int StatusHTTPVersionNotSupported       = 505;
	public static final int StatusVariantAlsoNegotiates         = 506;
	public static final int StatusInsufficientStorage           = 507;
	public static final int StatusLoopDetected                  = 508;
	public static final int StatusNotExtended                   = 510;
	public static final int StatusNetworkAuthenticationRequired = 511;
	
}