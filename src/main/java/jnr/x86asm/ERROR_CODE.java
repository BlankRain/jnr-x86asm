//
// Copyright (C) 2010 Wayne Meissner
// Copyright (c) 2008-2009, Petr Kobalicek <kobalicek.petr@gmail.com>
//
// Permission is hereby granted, free of charge, to any person
// obtaining a copy of this software and associated documentation
// files (the "Software"), to deal in the Software without
// restriction, including without limitation the rights to use,
// copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the
// Software is furnished to do so, subject to the following
// conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
// OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
// HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
// WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
// OTHER DEALINGS IN THE SOFTWARE.

package jnr.x86asm;

public enum ERROR_CODE {
  
    /** No error (success). */
    ERROR_NONE,

    /** Memory allocation error (@c ASMJIT_MALLOC returned @c NULL). */
    ERROR_NO_HEAP_MEMORY,

    /** Virtual memory allocation error (@c VirtualMemory returned @c NULL). */
    ERROR_NO_VIRTUAL_MEMORY,

    /** Unknown instruction. This happens only if instruction code is
    *out of bounds. Shouldn't happen. */
    ERROR_UNKNOWN_INSTRUCTION,

    /**
    * Illegal instruction.
    *
    * Usually generated by AsmJit::AssemblerCore class when emitting instruction
    * opcode. If this error is generated the target buffer is not affected by
    * this invalid instruction. In debug mode you get assertion failure instead.
    */
    ERROR_ILLEGAL_INSTRUCTION,

    /** Illegal addressing used (unencodable). */
    ERROR_ILLEGAL_ADDRESING,

    /** Short jump instruction used, but displacement is out of bounds. */
    ERROR_ILLEGAL_SHORT_JUMP,

    /** Count of error codes by AsmJit. Can grow in future. */
    _ERROR_COUNT;

    public final int intValue() {
        return ordinal();
    }
}
