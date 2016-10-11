package com.kpf.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by 1 on 2016/10/10.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
