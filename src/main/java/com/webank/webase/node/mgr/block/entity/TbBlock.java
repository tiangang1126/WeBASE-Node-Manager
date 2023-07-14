/**
 * Copyright 2014-2021  the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.webase.node.mgr.block.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity class of table tb_block.
 */
@Data
@NoArgsConstructor
public class TbBlock {
    private String pkHash;
    private BigInteger blockNumber = BigInteger.ZERO;
    private LocalDateTime blockTimestamp;
    private int transCount;
    private int sealerIndex;
    private String sealer;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    // add block total gas used
    // 十进制的string
    private String gasUsed;


    /**
     * init by  pkHash、blockNumber、blockTimestamp、transCount.
     */
    public TbBlock(String pkHash, BigInteger blockNumber,
        LocalDateTime blockTimestamp, Integer transCount,int sealerIndex) {
        this(pkHash,blockNumber,blockTimestamp,transCount,sealerIndex, null);
    }

        /**
     * init by  pkHash、blockNumber、blockTimestamp、transCount、useGas
     */
    public TbBlock(String pkHash, BigInteger blockNumber,
        LocalDateTime blockTimestamp, Integer transCount,int sealerIndex,String gasUsed) {
        super();
        this.pkHash = pkHash;
        this.blockNumber = blockNumber;
        this.blockTimestamp = blockTimestamp;
        this.transCount = transCount;
        this.sealerIndex = sealerIndex;
        this.gasUsed = gasUsed ;
    }
}
