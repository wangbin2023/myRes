package com.flowable.flowableproject.service.impl;

import com.flowable.flowableproject.entity.Oplog;
import com.flowable.flowableproject.mapper.OplogMapper;
import com.flowable.flowableproject.service.IOplogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bin
 * @since 2022-12-28
 */
@Service
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
