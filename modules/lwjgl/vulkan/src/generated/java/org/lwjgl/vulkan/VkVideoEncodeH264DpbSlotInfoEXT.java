/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies H.264 encode DPB picture information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT}</li>
 * <li>{@code pStdReferenceInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264ReferenceInfo} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264DpbSlotInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoEncodeH264ReferenceInfo StdVideoEncodeH264ReferenceInfo} const * {@link #pStdReferenceInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH264DpbSlotInfoEXT extends Struct<VkVideoEncodeH264DpbSlotInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDREFERENCEINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDREFERENCEINFO = layout.offsetof(2);
    }

    protected VkVideoEncodeH264DpbSlotInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264DpbSlotInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264DpbSlotInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264DpbSlotInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264DpbSlotInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a pointer to a {@code StdVideoEncodeH264ReferenceInfo} structure specifying the syntax and other codec-specific information from the H.264 specification associated with this reference picture. */
    @NativeType("StdVideoEncodeH264ReferenceInfo const *")
    public StdVideoEncodeH264ReferenceInfo pStdReferenceInfo() { return npStdReferenceInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264DpbSlotInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264DpbSlotInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264DpbSlotInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264ReferenceInfo} to the {@link #pStdReferenceInfo} field. */
    public VkVideoEncodeH264DpbSlotInfoEXT pStdReferenceInfo(@NativeType("StdVideoEncodeH264ReferenceInfo const *") StdVideoEncodeH264ReferenceInfo value) { npStdReferenceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264DpbSlotInfoEXT set(
        int sType,
        long pNext,
        StdVideoEncodeH264ReferenceInfo pStdReferenceInfo
    ) {
        sType(sType);
        pNext(pNext);
        pStdReferenceInfo(pStdReferenceInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264DpbSlotInfoEXT set(VkVideoEncodeH264DpbSlotInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264DpbSlotInfoEXT malloc() {
        return new VkVideoEncodeH264DpbSlotInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264DpbSlotInfoEXT calloc() {
        return new VkVideoEncodeH264DpbSlotInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264DpbSlotInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264DpbSlotInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264DpbSlotInfoEXT create(long address) {
        return new VkVideoEncodeH264DpbSlotInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264DpbSlotInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264DpbSlotInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264DpbSlotInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264DpbSlotInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264DpbSlotInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264DpbSlotInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pStdReferenceInfo}. */
    public static StdVideoEncodeH264ReferenceInfo npStdReferenceInfo(long struct) { return StdVideoEncodeH264ReferenceInfo.create(memGetAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PSTDREFERENCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264DpbSlotInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pStdReferenceInfo(StdVideoEncodeH264ReferenceInfo) pStdReferenceInfo}. */
    public static void npStdReferenceInfo(long struct, StdVideoEncodeH264ReferenceInfo value) { memPutAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PSTDREFERENCEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoEncodeH264DpbSlotInfoEXT.PSTDREFERENCEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264DpbSlotInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264DpbSlotInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264DpbSlotInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264DpbSlotInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264DpbSlotInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264DpbSlotInfoEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkVideoEncodeH264DpbSlotInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264DpbSlotInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264DpbSlotInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264DpbSlotInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264DpbSlotInfoEXT.npNext(address()); }
        /** @return a {@link StdVideoEncodeH264ReferenceInfo} view of the struct pointed to by the {@link VkVideoEncodeH264DpbSlotInfoEXT#pStdReferenceInfo} field. */
        @NativeType("StdVideoEncodeH264ReferenceInfo const *")
        public StdVideoEncodeH264ReferenceInfo pStdReferenceInfo() { return VkVideoEncodeH264DpbSlotInfoEXT.npStdReferenceInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264DpbSlotInfoEXT#sType} field. */
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264DpbSlotInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT} value to the {@link VkVideoEncodeH264DpbSlotInfoEXT#sType} field. */
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264DpbSlotInfoEXT#pNext} field. */
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264DpbSlotInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264ReferenceInfo} to the {@link VkVideoEncodeH264DpbSlotInfoEXT#pStdReferenceInfo} field. */
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pStdReferenceInfo(@NativeType("StdVideoEncodeH264ReferenceInfo const *") StdVideoEncodeH264ReferenceInfo value) { VkVideoEncodeH264DpbSlotInfoEXT.npStdReferenceInfo(address(), value); return this; }

    }

}