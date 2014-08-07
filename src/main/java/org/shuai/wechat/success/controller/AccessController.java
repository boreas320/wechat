package org.shuai.wechat.success.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.shuai.wechat.success.common.SignUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/access")
public class AccessController {
	private static Logger logger = Logger.getLogger(AccessController.class);

	@RequestMapping("validate")
	@ResponseBody
	public String validate(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("echostr") String echostr) {

		/**
		 * timestamp 时间戳 nonce 随机数 echostr
		 */
		// String signature = request.getParameter("signature");
		// String timestamp = request.getParameter("timestamp");
		// String nonce = request.getParameter("nonce");
		//
		// String echostr = request.getParameter("echostr");

		// List<String> list = new ArrayList<String>();
		// list.add(timestamp);
		// list.add(nonce);
		// list.add(ProjectCommons.TOKEN);
		// Collections.sort(list);
		// StringBuilder sb = new StringBuilder();
		// for (String s : list) {
		// sb.append(s);
		// }
		// String hexString = "";
		// try {
		// hexString = EncodeUtils.encode(sb.toString());
		//
		// } catch (Exception e) {
		// logger.error(e.getMessage());
		// return "err";
		// }
		// if (signature != null && signature.equals(hexString)) {
		// return echostr;
		// } else {
		// return "false";
		// }/
		// boolean b = SignUtil.checkSignature(signature, timestamp, nonce);
		// if (b) {
		// return echostr;
		// } else {
		// return "false";
		// }
		return echostr;
	}

	@ResponseBody
	public String name() {
		return "haha";
	}

}
